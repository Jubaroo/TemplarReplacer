
package org.jubaroo.mods.templarreplacer;

import org.gotti.wurmunlimited.modloader.interfaces.Configurable;
import org.gotti.wurmunlimited.modloader.interfaces.Initable;
import org.gotti.wurmunlimited.modloader.interfaces.ServerStartedListener;
import org.gotti.wurmunlimited.modloader.interfaces.WurmServerMod;
import org.gotti.wurmunlimited.modsupport.creatures.ModCreatures;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Initiator implements WurmServerMod, Initable, Configurable, ServerStartedListener {
    public static Logger logger = Logger.getLogger(Initiator.class.getName());

    // Templar
    static String templarModel = "model.creature.humanoid.human.spirit.templar";
    static float templarCR = 6;
    static float templarNaturalArmor = 0.3f;
    static float templarMoveSpeed = 1.0f;
    static int templarSize = 100;
    static float templarKickDamage = 7.0f;
    static float templarHandDamage = 5.0f;
    static float templarBiteDamage = 5.0f;
    static int templarCombatDamageType = 1;
    static float templarBodyStrength = 30.0f;
    static float templarBodyControl = 30.0f;
    static float templarBodyStamina = 35.0f;
    static float templarMindLogic = 17.0f;
    static float templarMindSpeed = 27.0f;
    static float templarSoulStrength = 24.0f;
    static float templarSoulDepth = 24.0f;
    static float templarWeaponlessFighting = 80.0f;
    // Guard
    static String guardModel = "model.creature.humanoid.human.guard.tower.free";
    static float guardCR = 6;
    static float guardNaturalArmor = 0.4f;
    static float guardMoveSpeed = 1.5f;
    static int guardSize = 100;
    static float guardKickDamage = 7.5f;
    static int guardCombatDamageType = 1;
    static float guardBodyStrength = 20.0f;
    static float guardBodyControl = 17.0f;
    static float guardBodyStamina = 21.0f;
    static float guardMindLogic = 15.0f;
    static float guardMindSpeed = 15.0f;
    static float guardSoulStrength = 15.0f;
    static float guardSoulDepth = 15.0f;
    static float guardWeaponlessFighting = 45.0f;
    // Debug
    private static boolean debug = false;

    @Override
    public void init() {
        try {
            logger.log(Level.INFO, "Initializing...()");
            ModCreatures.init();
        } catch (Throwable throwable) {
            logger.log(Level.SEVERE, "Error In Initializing!", throwable);
        }
    }

    private static void debug(String msg) {
        if (debug) {
            logger.info(msg);
        }
    }

    @Override
    public void configure(Properties properties) {
        try {
            Initiator.debug = Boolean.parseBoolean(properties.getProperty("debug", String.valueOf(Initiator.debug)));
            Initiator.templarNaturalArmor = Float.parseFloat(properties.getProperty("templarNaturalArmor", String.valueOf(templarNaturalArmor)));
            Initiator.templarCR = Float.parseFloat(properties.getProperty("templarCR", String.valueOf(templarCR)));
            Initiator.templarModel = String.valueOf(properties.getProperty("templarModel", String.valueOf(templarModel)));
            Initiator.templarMoveSpeed = Float.parseFloat(properties.getProperty("templarMoveSpeed", String.valueOf(templarMoveSpeed)));
            Initiator.templarSize = Integer.parseInt(properties.getProperty("templarSize", String.valueOf(templarSize)));
            Initiator.templarKickDamage = Float.parseFloat(properties.getProperty("templarKickDamage", String.valueOf(templarKickDamage)));
            Initiator.templarBiteDamage = Float.parseFloat(properties.getProperty("templarBiteDamage", String.valueOf(templarBiteDamage)));
            Initiator.templarHandDamage = Float.parseFloat(properties.getProperty("templarHandDamage", String.valueOf(templarHandDamage)));
            Initiator.templarCombatDamageType = Integer.parseInt(properties.getProperty("templarCombatDamageType", String.valueOf(templarCombatDamageType)));
            Initiator.templarBodyStrength = Float.parseFloat(properties.getProperty("templarBodyStrength", String.valueOf(templarBodyStrength)));
            Initiator.templarBodyControl = Float.parseFloat(properties.getProperty("templarBodyControl", String.valueOf(templarBodyControl)));
            Initiator.templarBodyStamina = Float.parseFloat(properties.getProperty("templarBodyStamina", String.valueOf(templarBodyStamina)));
            Initiator.templarMindLogic = Float.parseFloat(properties.getProperty("templarMindLogic", String.valueOf(templarMindLogic)));
            Initiator.templarMindSpeed = Float.parseFloat(properties.getProperty("templarMindSpeed", String.valueOf(templarMindSpeed)));
            Initiator.templarSoulStrength = Float.parseFloat(properties.getProperty("templarSoulStrength", String.valueOf(templarSoulStrength)));
            Initiator.templarSoulDepth = Float.parseFloat(properties.getProperty("templarSoulDepth", String.valueOf(templarSoulDepth)));
            Initiator.templarWeaponlessFighting = Float.parseFloat(properties.getProperty("templarWeaponlessFighting", String.valueOf(templarWeaponlessFighting)));
            Initiator.guardNaturalArmor = Float.parseFloat(properties.getProperty("guardNaturalArmor", String.valueOf(guardNaturalArmor)));
            Initiator.guardCR = Float.parseFloat(properties.getProperty("guardCR", String.valueOf(guardCR)));
            Initiator.guardModel = String.valueOf(properties.getProperty("guardModel", String.valueOf(guardModel)));
            Initiator.guardMoveSpeed = Float.parseFloat(properties.getProperty("guardMoveSpeed", String.valueOf(guardMoveSpeed)));
            Initiator.guardSize = Integer.parseInt(properties.getProperty("guardSize", String.valueOf(guardSize)));
            Initiator.guardKickDamage = Float.parseFloat(properties.getProperty("guardKickDamage", String.valueOf(guardKickDamage)));
            Initiator.guardCombatDamageType = Integer.parseInt(properties.getProperty("guardCombatDamageType", String.valueOf(guardCombatDamageType)));
            Initiator.guardBodyStrength = Float.parseFloat(properties.getProperty("guardBodyStrength", String.valueOf(guardBodyStrength)));
            Initiator.guardBodyControl = Float.parseFloat(properties.getProperty("guardBodyControl", String.valueOf(guardBodyControl)));
            Initiator.guardBodyStamina = Float.parseFloat(properties.getProperty("guardBodyStamina", String.valueOf(guardBodyStamina)));
            Initiator.guardMindLogic = Float.parseFloat(properties.getProperty("guardMindLogic", String.valueOf(guardMindLogic)));
            Initiator.guardMindSpeed = Float.parseFloat(properties.getProperty("guardMindSpeed", String.valueOf(guardMindSpeed)));
            Initiator.guardSoulStrength = Float.parseFloat(properties.getProperty("guardSoulStrength", String.valueOf(guardSoulStrength)));
            Initiator.guardSoulDepth = Float.parseFloat(properties.getProperty("guardSoulDepth", String.valueOf(guardSoulDepth)));
            Initiator.guardWeaponlessFighting = Float.parseFloat(properties.getProperty("guardWeaponlessFighting", String.valueOf(guardWeaponlessFighting)));
            logger.log(Level.INFO, "========================================= Templar Replacer Mod Settings ================================================");
            if (Initiator.debug) {
                logger.log(Level.INFO, "Templar Replacer Mod Debugging: Enabled");
            }
            if (!Initiator.debug) {
                logger.log(Level.INFO, "Templar Replacer Mod Debugging: Disabled  >>>> Toggle true in properties file if you want to see the settings values and info logging for this mod <<<<");
            }
            debug("======================= Templars ======================");
            if (templarNaturalArmor > 0.3f) {
                debug("!!!WARNING!!! Setting templarNaturalArmor to a value greater than 0.3 will result in a weaker templar. Try lowering the value to something between 0.3 and 0.001");
            }
            debug("templarNaturalArmor: " + templarNaturalArmor);
            debug("templarCR: " + templarCR);
            debug("templarModel: " + templarModel);
            if (templarMoveSpeed > 3.0f) {
                templarMoveSpeed = 3.0f;
                debug("!!!WARNING!!! templarMoveSpeed is set too high! Value reduced to 3.0");
            }
            debug("guardMoveSpeed: " + templarMoveSpeed);
            if (templarSize > 300) {
                debug(">>>> A templarSize value greater than 300% will not give a larger creature model <<<<");
            }
            debug("templarSize: " + templarSize + "%");
            debug("templarKickDamage: " + templarKickDamage);
            debug("templarBiteDamage: " + templarBiteDamage);
            debug("templarHandDamage: " + templarHandDamage);
            debug("templarCombatDamageType: " + templarCombatDamageType);
            debug("templarBodyStrength: " + templarBodyStrength);
            debug("templarBodyControl: " + templarBodyControl);
            debug("templarMindLogic: " + templarMindLogic);
            debug("templarMindSpeed: " + templarMindSpeed);
            debug("templarSoulStrength: " + templarSoulStrength);
            debug("templarSoulDepth: " + templarSoulDepth);
            debug("templarWeaponlessFighting: " + templarWeaponlessFighting);
            debug("======================= Guards ======================");
            if (guardNaturalArmor > 0.4f) {
                debug("!!!WARNING!!! Setting guardNaturalArmor to a value greater than 0.4 will result in a weaker templar. Try lowering the value to something between 0.4 and 0.001");
            }
            debug("guardNaturalArmor: " + guardNaturalArmor);
            debug("guardCR: " + guardCR);
            debug("guardModel: " + guardModel);
            if (guardMoveSpeed > 3.0f) {
                guardMoveSpeed = 3.0f;
                debug("!!!WARNING!!! guardMoveSpeed is set too high! Value reduced to 3.0");
            }
            debug("guardMoveSpeed: " + guardMoveSpeed);
            if (guardSize > 300) {
                debug(">>>> A guardSize value greater than 300% will not give a larger creature model <<<<");
            }
            debug("guardSize: " + guardSize + "%");
            debug("guardKickDamage: " + guardKickDamage);
            debug("guardCombatDamageType: " + guardCombatDamageType);
            debug("guardBodyStrength: " + guardBodyStrength);
            debug("guardBodyControl: " + guardBodyControl);
            debug("guardBodyStamina: " + guardBodyStamina);
            debug("guardMindLogic: " + guardMindLogic);
            debug("guardSoulStrength: " + guardSoulStrength);
            debug("guardSoulDepth: " + guardSoulDepth);
            debug("templarNaturalArmor: " + templarNaturalArmor);
            debug("guardWeaponlessFighting: " + guardWeaponlessFighting);
            logger.log(Level.INFO, "========================================= Templar Replacer Mod Settings ================================================");
        } catch (Throwable throwable) {
            logger.log(Level.SEVERE, "Error in configure setting()!", throwable);
        }
    }

    @Override
    public void onServerStarted() {
        try {
            debug("Setting guard and templar templates...");
            TemplateModifier.setTemplateVariables();
            debug("Done setting guard and templar templates...");
        } catch (IllegalArgumentException | ClassCastException e) {
            e.printStackTrace();
        }
    }

    // updated to fix issues with 1.9.1.6
    public String getVersion() {
        return "v1.2";
    }

}