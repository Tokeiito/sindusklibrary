package mod.sin.lib;

import java.util.Properties;
import java.util.logging.Logger;

import org.gotti.wurmunlimited.modloader.interfaces.Configurable;
import org.gotti.wurmunlimited.modloader.interfaces.PreInitable;
import org.gotti.wurmunlimited.modloader.interfaces.WurmServerMod;

public class SinduskLibrary
implements WurmServerMod,
Configurable,
PreInitable {
    boolean bDebug = false;
    
    private static Logger logger = Logger.getLogger(SinduskLibrary.class.getName());

    public void configure(Properties properties) {
        ArmourAssist.initializeArmourMaps();
        SkillAssist.initializeSkillMaps();
        WoundAssist.initializeWoundMaps();
    }
    
    public void preInit() {
    }

}