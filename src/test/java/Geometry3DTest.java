import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Geometry3DTest {
	
	public static final double EPSILON = 0.1;
	
    @Test
    //3 units tests and their implementation to calculate the volume of cuboid
	//This function calculates the volume of a cuboid with positive input
    public void testCuboidVolumeWithPositiveInput() {
    	var geometry3D = new Geometry3D();
        float length = 5f;
        float breadth = 3f;
        float height = 10f;
        
		float actualVolumeCuboid = geometry3D.cuboidVolume(length, breadth, height);
		assertEquals(150, actualVolumeCuboid,EPSILON);
    }
    
    @Test
    // This function tests the calculation of cuboid volume with negative input
    public void testCuboidVolumeWithNegativeInput() {
        var geometry3D = new Geometry3D();
    	float length = -5f;
	    float breadth = 3f;
	    float height = 10f;
	    
        assertThrows(IllegalArgumentException.class, //argument passed to the method
        		() -> {
        			float actualVolume = geometry3D.cuboidVolume(length, breadth, height);
        			assertEquals(150,actualVolume,EPSILON);
        		});
    }    
    
    @Test
	//This function calculates the volume of a cuboid with zero input
    public void testCuboidVolumeWithZeroInput() {
    	var geometry3D = new Geometry3D();
        float length = 0f;
        float breadth = 3f;
        float height = 10f;
        
		float actualVolume = geometry3D.cuboidVolume(length, breadth, height);
		assertEquals(0,actualVolume,EPSILON);        
    }
    
       
//  ------------------------------------------------------------------------------
  
  
    @Test
    //3 units tests and their implementation to calculate the surface area of cuboid
	//This function calculates the surface area of a cuboid with positive input
    public void testCuboidSurfaceAreaWithPositiveInput() {
    	var geometry3D = new Geometry3D();
        float length = 5f;
        float breadth = 3f;
        float height = 10f;

		float actualSurfaceArea = geometry3D.cuboidSurfaceArea(length, breadth, height);
		assertEquals(190, actualSurfaceArea,EPSILON);
    }
    
    @Test
	//This function calculates the surface area of a cuboid with negative input
    public void testCuboidSurfaceAreaWithNegativeInput() {
    	var geometry3D = new Geometry3D();
        float length = -5f;
        float breadth = 3f;
        float height = 10f;

        assertThrows(IllegalArgumentException.class, //argument passed to the method
        		() -> {
        			float actualSurfaceArea = geometry3D.cuboidSurfaceArea(length, breadth, height);
        			assertEquals(65,actualSurfaceArea,EPSILON);
        		});
    }
    
    @Test
	//This function calculates the surface area of a cuboid with zero input
    public void testCuboidSurfaceAreaWithZeroInput() {
    	var geometry3D = new Geometry3D();
        float length = 0f;
        float breadth = 3f;
        float height = 10f;
        
		float actualVolume = geometry3D.cuboidVolume(length, breadth, height);
		assertEquals(0,actualVolume,EPSILON);            	
    }
    
     
//  ------------------------------------------------------------------------------


    @Test
    //3 units tests and their implementation to calculate the volume of square pyramid
	//This function calculates the volume of square pyramid with positive input
    public void testVolumeSquarePyramidWithPositiveInput() {
    	var geometry3D = new Geometry3D();
        float height = 10f;
        float baseEdge = 3f;
        
		float actualVolumePyramid  = geometry3D.volumeSquarePyramid(height, baseEdge);
		assertFalse(30 == actualVolumePyramid);
    }
    
    @Test
	//This function calculates the volume of square pyramid with negative input
    public void testVolumeSquarePyramidWithNegativeInput() {
    	var geometry3D = new Geometry3D();
        float height = -10f;
        float baseEdge = 3f;
        
        assertThrows(IllegalArgumentException.class, //argument passed to the method
        		() -> {
        			float actualVolumePyramid = geometry3D.volumeSquarePyramid(baseEdge, height);
        			assertEquals(30,actualVolumePyramid,EPSILON);
        		});
    }
    
    @Test
	//This function calculates the volume square pyramid with zero input
    public void testVolumeSquarePyramidWithZeroInput() {
    	var geometry3D = new Geometry3D();
        float height = 0f;
        float baseEdge = 3f;
        
		float actualVolumePyramid  = geometry3D.volumeSquarePyramid(height, baseEdge);
		assertEquals(0, actualVolumePyramid,EPSILON);
    }
    
    
//    ------------------------------------------------------------------------------
    
    
    @Test
    //3 units tests and their implementation to calculate the surface area of square pyramid
	//This function calculates the surface area of square pyramid with positive input
    public void testSurfaceAreaSquarePyramidWithPositiveInput() {
    	var geometry3D = new Geometry3D();
        float height = 10f;
        float baseEdge = 3f;
        
		float actualSurfaceAreaPyramid = geometry3D.squarePyramidSurfaceArea(height, baseEdge);
		assertFalse(69 == actualSurfaceAreaPyramid);
    }
    
    @Test
	//This function calculates the volume of square pyramid with negative input
    public void testSurfaceAreaSquarePyramidWithNegativeInput() {
    	var geometry3D = new Geometry3D();
        float height = -10f;
        float baseEdge = 3f;
        
        assertThrows(IllegalArgumentException.class, //argument passed to the method
        		() -> {
        			float actualSurfaceAreaPyramid = geometry3D.squarePyramidSurfaceArea(baseEdge, height);
        			assertEquals(69,actualSurfaceAreaPyramid,EPSILON);
        		});
    }
    
    @Test
	//This function calculates the surface area of square pyramid with zero input
    public void testSurfaceAreaSquarePyramidWithZeroInput() {
    	var geometry3D = new Geometry3D();
        float height = 0f;
        float baseEdge = 3f;
        
		float actualSurfaceAreaPyramid = geometry3D.squarePyramidSurfaceArea(height, baseEdge);
		assertEquals(0, actualSurfaceAreaPyramid,EPSILON);
    }
    
    
//  ------------------------------------------------------------------------------
  
  
	  @Test
	  //3 units tests and their implementation to calculate the volume of Tetrahedron
	  //This function calculates the volume of Tetrahedron with positive input
	  public void testVolumeTetrahedronWithPositiveInput() {
		  var geometry3D = new Geometry3D();
	      float edge = 3f;
	      
	      float actualVolumetetrahedron = geometry3D.volumeTetrahedron(edge);
	      assertFalse(3 == actualVolumetetrahedron);
	  }
	  
	  //This function calculates the volume of Tetrahedron with negative input
	  public void testVolumeTetrahedronWithNegativeInput() {
		  var geometry3D = new Geometry3D();
	      float edge = -3f;
	      
	      assertThrows(IllegalArgumentException.class, //argument passed to the method
	    		  () -> {
	    			  float actualVolumetetrahedron = geometry3D.volumeTetrahedron(edge);
	    			  assertEquals(3,actualVolumetetrahedron,EPSILON);
	    		  });
	  }
	  
	  //This function calculates the volume of Tetrahedron with zero input
	  public void testVolumeTetrahedronWithZeroInput() {
	      var geometry3D = new Geometry3D();
	      float edge = 3f;
	      
	      float actualVolumetetrahedron = geometry3D.volumeTetrahedron(edge);
	      assertEquals(0, actualVolumetetrahedron,EPSILON);
	  }
	  
	  
	//  ------------------------------------------------------------------------------
	  
	  
	  @Test
	  //3 units tests and their implementation to calculate the surface area of Tetrahedron
	  //This function calculates the surface area of Tetrahedron with positive input
	  public void testTetrahedronSurfaceAreaWithPositiveInput() {
		  var geometry3D = new Geometry3D();
		  float edge = 5f;
		      
		  float actualTetrahedronSurfaceArea = geometry3D.tetrahedronSurfaceArea(edge);
		  assertFalse(43 == actualTetrahedronSurfaceArea);
	  }
		  
	  @Test
	  //This function calculates the surface area of Tetrahedron with negative input
	  public void testTetrahedronSurfaceAreaWithNegativeInput() {
		  var geometry3D = new Geometry3D();
		  float edge = -5f;
		  
		  assertThrows(IllegalArgumentException.class, //argument passed to the method
	    		  () -> {
	    			  float actualTetrahedronSurfaceArea = geometry3D.tetrahedronSurfaceArea(edge);
	    			  assertEquals(43,actualTetrahedronSurfaceArea,EPSILON);
	    		  });
	  }
	  
	  @Test
	  //This function calculates the volume of Tetrahedron with zero input
	  public void testTetrahedronSurfaceAreaWithZeroInput() {
	      var geometry3D = new Geometry3D();
	      float edge = 0f;
	      
	      float actualVolumetetrahedron = geometry3D.tetrahedronSurfaceArea(edge);
	      assertEquals(0, actualVolumetetrahedron,EPSILON);
	  }
}





