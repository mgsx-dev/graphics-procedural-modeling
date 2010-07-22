package org.mgs.graphics.lib.texture;

import org.mgs.graphics.lib.math.Color;
import org.mgs.graphics.lib.math.Point3D;

public class Damier extends Texture {
	public Color color1 = new Color(0.2);
	public Color color2 = new Color(0.8);
	@Override
	public Color getColor(Point3D texCoord) {
		return ((floor2(texCoord.x) % 2) ^ (floor2(texCoord.y) % 2) ^ (floor2(texCoord.z) % 2)) > 0 ?
			color2 : color1;
	}
	// TODO faire dans util
	private static int floor2(double t){
		return (int)Math.floor(t < 0 ? 1 - t : t); 
	}
}
