package org.mgs.graphics.lib.texture;

import java.util.Random;

import org.mgs.graphics.lib.math.Point3D;
import org.mgs.graphics.lib.math.Util;

public class Noise implements ScalarFromSpace {

	///////////////////////////////////////
	// PERMUTATION
	
	// taille des tables en bits.
	private static final int tableSizeBits = 8;
	// seed pour la table de permutation.
	private static long permutationSeed = 0xdeadbeaf;
	// la table de permutation.
	private static int [] permutationTable = null;
	
	private static void initPermutationTable(){
		if(permutationTable == null){
			int size = getTableSize();
			permutationTable = new int [size];
			Random rand = new Random(permutationSeed);
			for(int i=0 ; i<size ; i++){
				permutationTable[i] = rand.nextInt(size);
			}
		}
	}
	private static int getTableSize(){
		return 1 << tableSizeBits;
	}
	private static int getPermMask(){
		return getTableSize() - 1;
	}
	private static int getPermIndex(int n){
		return permutationTable[n & getPermMask()];
	}
	private static int getPermIndex(int x, int y, int z){
		return getPermIndex(x + getPermIndex(y + getPermIndex(z)));
	}
	
	///////////////////////////////////////
	// NOISE
	
	private long noiseSeed = 0xdeadbeef;
	private double [] noiseTable = null;
	
	public Noise(long seed){
		this.noiseSeed = seed;
		initNoiseTable();
	}
	
	private void initNoiseTable(){
		initPermutationTable();
		if(noiseTable == null){
			int size = getTableSize();
			noiseTable = new double [size];
			Random rand = new Random(noiseSeed);
			int max = 0x7fffffff;
			for(int i=0 ; i<size ; i++){
				noiseTable[i] = rand.nextInt(max) / (double)(max - 1);
			}
		}
	}
	
	private double getLattice(int x, int y, int z){
		return noiseTable[getPermIndex(x, y, z)];
	}
	
	///////////////////////////////////////
	// IMPLEMENTATION

	public double getValue(Point3D point) {
		double [] tabx = new double [4];
		double [] taby = new double [4];
		double [] tabz = new double [4];
		// d�composition des coordonn�es.
		int ix = Util.integerValue(point.x);
		double fx = Util.remainValue(point.x);
		int iy = Util.integerValue(point.y);
		double fy = Util.remainValue(point.y);
		int iz = Util.integerValue(point.z);
		double fz = Util.remainValue(point.z);
		// interpolation sur les valeurs.
		for(int k=-1 ; k<=2 ; k++){
			for(int j=-1 ; j<=2 ; j++){
				for(int i=-1 ; i<=2 ; i++){
					tabx[i+1] = getLattice(ix+i, iy+j, iz+k);
				}
				taby[j+1] = Util.cubicSpline(fx, tabx);
			}
			tabz[k+1] = Util.cubicSpline(fy, taby);
		}
		return Util.cubicSpline(fz, tabz);
	}

}
