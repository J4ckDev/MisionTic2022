/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidvolume1;

/**
 *
 * @author j4ckdev
 */
public class SolidVolume1 {

    public static float sphereVolumeWithoutMathPI(float radius) {
        return (float) ((4 * 3.1416 * Math.pow(radius, 3)) / 3);
    }

    public static float sphereVolume(float radius) {
        return (float) ((4 * Math.PI * Math.pow(radius, 3)) / 3);
    }

    public static float coneVolumeWithoutMathPI(float radius, float height) {
        return (float) ((3.1416 * Math.pow(radius, 2) * height) / 3);
    }

    public static float coneVolume(float radius, float height) {
        return (float) ((Math.PI * Math.pow(radius, 2) * height) / 3);
    }

    // En Java no existe división entera, por lo que se obtiene la altura como entero
    public static float coneVolumeWithIntHeight(float radius, int height) {
        return (float) ((3.1416 * Math.pow(radius, 2) * height) / 3);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //float totalVolume = sphereVolumeWithoutMathPI(3) + coneVolumeWithoutMathPI(4, (float) 4.5);
        //float totalVolume = sphereVolume(3) + coneVolume(4, (float) 4.5);
        float totalVolume = sphereVolume(3) + coneVolumeWithIntHeight(4, (int) 4.5);
        System.out.println(totalVolume);
    }

}
