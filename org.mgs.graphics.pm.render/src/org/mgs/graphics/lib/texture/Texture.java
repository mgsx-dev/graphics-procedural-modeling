package org.mgs.graphics.lib.texture;

import org.mgs.graphics.lib.math.Color;
import org.mgs.graphics.lib.math.Point3D;

public abstract class Texture {
	abstract public Color getColor(Point3D texCoord);
}
