/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.camera.AxisCamera;

/**
 *
 * @author Matthew
 */
public class Camera {

AxisCamera camera;

public Camera(){
camera = AxisCamera.getInstance();

}
}