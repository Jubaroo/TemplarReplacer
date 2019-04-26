
package org.jubaroo.mods.templarreplacer;

import com.wurmonline.server.creatures.*;
import com.wurmonline.server.skills.Skills;
import com.wurmonline.server.skills.SkillsFactory;
import org.gotti.wurmunlimited.modloader.ReflectionUtil;

import static com.wurmonline.server.skills.SkillList.*;
import static com.wurmonline.server.skills.SkillList.WEAPONLESS_FIGHTING;

class TemplateModifier {

    private static void setCorpseModel(int templateId, String corpseModel){
        try{
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(templateId);
            if(template != null){
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(CreatureTemplate.class, "corpsename"), corpseModel);
            }
        } catch (NoSuchCreatureTemplateException | IllegalArgumentException | IllegalAccessException | ClassCastException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private static void setNoCorpse(int templateId){
        try{
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(templateId);
            if(template != null){
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(CreatureTemplate.class, "noCorpse"), true);
            }
        } catch (NoSuchCreatureTemplateException | IllegalArgumentException | IllegalAccessException | ClassCastException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private static void setNaturalArmour(int templateId, float value) {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(templateId);
            if (template != null) {
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "naturalArmour"), value);
            }
        } catch (NoSuchCreatureTemplateException | IllegalArgumentException | IllegalAccessException | ClassCastException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private static void setMoveSpeed(int templateId, float value) {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(templateId);
            if (template != null) {
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "speed"), value);
            }
        } catch (NoSuchCreatureTemplateException | IllegalArgumentException | IllegalAccessException | ClassCastException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private static void setCreatureModel(int templateId, String model) {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(templateId);
            if (template != null) {
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "modelName"), model);
            }
        } catch (NoSuchCreatureTemplateException | IllegalArgumentException | IllegalAccessException | ClassCastException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private static void setCreatureSize(int templateId, Integer x, Integer y, Integer z) {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(templateId);
            if (template != null) {
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "sizeModX"), x);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "sizeModY"), y);
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "sizeModZ"), z);
            }
        } catch (NoSuchCreatureTemplateException | IllegalArgumentException | IllegalAccessException | ClassCastException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private static void setCombatRating(int templateId, float value) {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(templateId);
            if (template != null) {
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "baseCombatRating"), value);
            }
        } catch (NoSuchCreatureTemplateException | IllegalArgumentException | IllegalAccessException | ClassCastException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private static void setKickDamage(int templateId, float value) {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(templateId);
            if (template != null) {
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "kickDamage"), value);
            }
        } catch (NoSuchCreatureTemplateException | IllegalArgumentException | IllegalAccessException | ClassCastException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private static void setBiteDamage(int templateId, float value) {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(templateId);
            if (template != null) {
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "biteDamage"), value);
            }
        } catch (NoSuchCreatureTemplateException | IllegalArgumentException | IllegalAccessException | ClassCastException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private static void setHandDamage(int templateId, float value) {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(templateId);
            if (template != null) {
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "handDamage"), value);
            }
        } catch (NoSuchCreatureTemplateException | IllegalArgumentException | IllegalAccessException | ClassCastException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private static void setcombatDamageType(int templateId, byte value) {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(templateId);
            if (template != null) {
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "combatDamageType"), value);
            }
        } catch (NoSuchCreatureTemplateException | IllegalArgumentException | IllegalAccessException | ClassCastException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private static void setSpiritTemplarSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.GUARD_SPIRIT_GOOD_DANGEROUS);
            if (template != null) {
                Skills skills = SkillsFactory.createSkills("Spirit templar");
                skills.learnTemp(BODY_STRENGTH, Initiator.templarBodyStrength); //30.0f
                skills.learnTemp(BODY_CONTROL, Initiator.templarBodyControl); //30.0f
                skills.learnTemp(BODY_STAMINA, Initiator.templarBodyStamina); //35.0f
                skills.learnTemp(MIND_LOGICAL, Initiator.templarMindLogic); //17.0f
                skills.learnTemp(MIND_SPEED, Initiator.templarMindSpeed); //27.0f
                skills.learnTemp(SOUL_STRENGTH, Initiator.templarSoulStrength); //24.0f
                skills.learnTemp(SOUL_DEPTH, Initiator.templarSoulDepth); //24.0f
                skills.learnTemp(WEAPONLESS_FIGHTING, Initiator.templarWeaponlessFighting); //80.0f
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            } // if
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void setTowerGuardSkills() {
        try {
            CreatureTemplate template = CreatureTemplateFactory.getInstance().getTemplate(CreatureTemplateIds.GUARD_KINGDOM_TOWER_FREEDOM);
            if (template != null) {
                Skills skills = SkillsFactory.createSkills("Isles tower guard");
                skills.learnTemp(BODY_STRENGTH, Initiator.guardBodyStrength); //20.0f
                skills.learnTemp(BODY_CONTROL, Initiator.guardBodyControl); //17.0f
                skills.learnTemp(BODY_STAMINA, Initiator.guardBodyStamina); //21.0f
                skills.learnTemp(MIND_LOGICAL, Initiator.guardMindLogic); //15.0f
                skills.learnTemp(MIND_SPEED, Initiator.guardMindSpeed); //15.0f
                skills.learnTemp(SOUL_STRENGTH, Initiator.guardSoulStrength); //15.0f
                skills.learnTemp(SOUL_DEPTH, Initiator.guardSoulDepth); //15.0f
                skills.learnTemp(WEAPONLESS_FIGHTING, Initiator.guardWeaponlessFighting); //45.0f
                ReflectionUtil.setPrivateField(template, ReflectionUtil.getField(template.getClass(), "skills"), skills);
            } // if
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setTemplateVariables() {
        int templarX = (int) (64 * (Initiator.templarSize / 100.0f));
        int templarY = (int) (64 * (Initiator.templarSize / 100.0f));
        int templarZ = (int) (64 * (Initiator.templarSize / 100.0f));
        int guardX = (int) (64 * (Initiator.guardSize / 100.0f));
        int guardY = (int) (64 * (Initiator.guardSize / 100.0f));
        int guardZ = (int) (64 * (Initiator.guardSize / 100.0f));
        try {
            // Set creatures corpse model
            //setCorpseModel(CreatureTemplateIds.GUARD_SPIRIT_GOOD_DANGEROUS, "fogspider.");
            //setNoCorpse(CreatureTemplateIds.GUARD_SPIRIT_GOOD_DANGEROUS);

            // Set creatures base combat rating
            setCombatRating(CreatureTemplateIds.GUARD_SPIRIT_GOOD_DANGEROUS, Initiator.templarCR); // 30.0F
            setCombatRating(CreatureTemplateIds.GUARD_KINGDOM_TOWER_FREEDOM, Initiator.guardCR); // 30.0F

            // Set creatures movement speed
            setMoveSpeed(CreatureTemplateIds.GUARD_SPIRIT_GOOD_DANGEROUS, Initiator.templarMoveSpeed); // 30.0F
            setMoveSpeed(CreatureTemplateIds.GUARD_KINGDOM_TOWER_FREEDOM, Initiator.guardMoveSpeed); // 30.0F

            // Set model names
            setCreatureModel(CreatureTemplate.GUARD_SPIRIT_GOOD_DANGEROUS, Initiator.templarModel);
            setCreatureModel(CreatureTemplate.GUARD_KINGDOM_TOWER_FREEDOM, Initiator.guardModel);

            // Set creatures size
            setCreatureSize(CreatureTemplateIds.GUARD_SPIRIT_GOOD_DANGEROUS, templarX, templarY, templarZ);
            setCreatureSize(CreatureTemplateIds.GUARD_KINGDOM_TOWER_FREEDOM, guardX, guardY, guardZ);

            // Set natural armor
            setNaturalArmour(CreatureTemplate.GUARD_SPIRIT_GOOD_DANGEROUS, Initiator.templarNaturalArmor); // 0.04f
            setNaturalArmour(CreatureTemplate.GUARD_KINGDOM_TOWER_FREEDOM, Initiator.guardNaturalArmor); // 0.04f

            // Set kick damage
            setKickDamage(CreatureTemplate.GUARD_SPIRIT_GOOD_DANGEROUS, Initiator.templarKickDamage); // 7.0F
            setKickDamage(CreatureTemplate.GUARD_KINGDOM_TOWER_FREEDOM, Initiator.guardKickDamage); // 7.0F

            // Set hand damage
            setHandDamage(CreatureTemplate.GUARD_SPIRIT_GOOD_DANGEROUS, Initiator.templarHandDamage); // 5.0F

            // Set bite damage
            setBiteDamage(CreatureTemplate.GUARD_SPIRIT_GOOD_DANGEROUS, Initiator.templarBiteDamage); // 5.0F

            // Set combat damage type
            setcombatDamageType(CreatureTemplate.GUARD_SPIRIT_GOOD_DANGEROUS, (byte) Initiator.templarCombatDamageType); // 1
            setcombatDamageType(CreatureTemplate.GUARD_KINGDOM_TOWER_FREEDOM, (byte) Initiator.guardCombatDamageType); // 1

            setSpiritTemplarSkills();
            setTowerGuardSkills();

        } catch (IllegalArgumentException | ClassCastException e) {
            e.printStackTrace();
        }
    }
}
