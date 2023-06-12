/**
  * Copyright 2023 bejson.com 
  */
package tech.chowyijiu.fortnite_api.entity.stat;

/**
 * Auto-generated: 2023-06-12 18:36:40
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Stats {

    private All all;
    private KeyboardMouse keyboardMouse;
    private Gamepad gamepad;
    private Touch touch;
    public void setAll(All all) {
         this.all = all;
     }
     public All getAll() {
         return all;
     }

    public void setKeyboardMouse(KeyboardMouse keyboardMouse) {
         this.keyboardMouse = keyboardMouse;
     }
     public KeyboardMouse getKeyboardMouse() {
         return keyboardMouse;
     }

    public void setGamepad(Gamepad gamepad) {
         this.gamepad = gamepad;
     }
     public Gamepad getGamepad() {
         return gamepad;
     }

    public void setTouch(Touch touch) {
         this.touch = touch;
     }
     public Touch getTouch() {
         return touch;
     }

}