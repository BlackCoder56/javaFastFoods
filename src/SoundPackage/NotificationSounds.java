package SoundPackage;

import java.io.IOException;

/**
 *
 * @author elisha
 */
public class NotificationSounds {
    private static final String SOUND_DIR = "/usr/share/sounds/freedesktop/stereo/";
    
    private static void play(String soundName){        
        try {
            String command  = "paplay " + SOUND_DIR + soundName;
            Runtime.getRuntime().exec(command);        
        } catch (IOException ex) {
            System.getLogger(NotificationSounds.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
    public static void playComplete(){
          play("complete.oga");
    }
}
