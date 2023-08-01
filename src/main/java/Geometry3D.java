public class Geometry3D {
	
//	It returns the volume of a cuboid
	public float cuboidVolume(double length, double breadth, double height) {
		if (length < 0 || breadth < 0 || height < 0) {
			throw new IllegalArgumentException ("Error");
		}
		return (float) (length * breadth * height);
	}
	
//	It returns the surface area of a cuboid
	public float cuboidSurfaceArea(float length, float breadth, float height) {
		if (length < 0 || breadth < 0 || height < 0) {
			throw new IllegalArgumentException ("Error");
		}
		return (float) (2*(length*breadth  + breadth* height + height*length));
	}
	
//	It returns the volume of a square pyramid
	public float volumeSquarePyramid (float baseEdge, float height) {
		if (baseEdge < 0 || height < 0) {
			throw new IllegalArgumentException ("Error");
		}
		return (float) ((1/3) * Math.pow(baseEdge, 2) * height);
	}
	
//	It returns the surface area of a square pyramid
	public float squarePyramidSurfaceArea (float baseEdge, float height) {
		if (baseEdge < 0 || height < 0) {
			throw new IllegalArgumentException ("Error");
		}
		return (float) (baseEdge * baseEdge + baseEdge * Math.sqrt(baseEdge * baseEdge + 4 * height * height));
	}
	
//	It returns the volume of a Tetrahedron
	public float volumeTetrahedron (float edge) {
		if (edge < 0) {
			throw new IllegalArgumentException ("Error");
		}
		return (float) ((edge * edge * edge) / (6 * Math.sqrt(2) ));
	}
	
//	It returns the surface area of a Tetrahedron
	public float tetrahedronSurfaceArea (float edge) {
		if (edge < 0) {
			throw new IllegalArgumentException ("Error");
		}
		return (float) (Math. sqrt(3) * (edge * edge)) ;
	}
}


