import javax.swing.*;

public class Source {
        private int rngValueCharacterRace;
    private String characterRace;
    private int rngValueMainSkill;
    private String MainSkill;
    private int rngValueSecondarySkill;
    private String SecondarySkill;
    private int rngCharacterSex;
    private String characterSex;
    public Source(){
        this.rngValueCharacterRace = (int) (Math.random() * 10) + 1;
        this.rngValueMainSkill = (int) (Math.random() * 8) + 1;
        this.rngValueSecondarySkill = (int) (Math.random() * 10) + 1;
        this.rngCharacterSex = (int) (Math.random() * 2) + 1;
    }

    public void characterGeneration(){
        switch(this.rngValueCharacterRace){
            case(1):
                characterRace = "Nord";
                break;
            case(2):
                characterRace = "Breton";
                break;
            case(3):
                characterRace = "Redguard";
                break;
            case(4):
                characterRace = "Imperial";
                break;
            case(5):
                characterRace = "Dark Elf";
                break;
            case(6):
                characterRace = "Wood Elf";
                break;
            case(7):
                characterRace = "High Elf";
                break;
            case(8):
                characterRace = "Orc";
                break;
            case(9):
                characterRace = "Khajiit";
                break;
            case(10):
                characterRace = "Argonian";
                break;
        }
        switch(this.rngValueMainSkill) {
            case(1):
                MainSkill = "One-Handed";
                break;
            case(2):
                MainSkill = "Two-Handed";
                break;
            case(3):
                MainSkill = "Destruction";
                break;
            case(4):
                MainSkill = "Restoration";
                break;
            case(5):
                MainSkill = "Illusion";
                break;
            case(6):
                MainSkill = "Block";
                break;
            case(7):
                MainSkill = "Conjuration";
                break;
            case(8):
                MainSkill = "Archery";
                break;
        }

        switch(this.rngValueSecondarySkill){
            case(1):
                SecondarySkill = "Enchanting";
                break;
            case(2):
                SecondarySkill = "Alteration";
                break;
            case(3):
                SecondarySkill = "Smiting";
                break;
            case(4):
                SecondarySkill = "Heavy Armor";
                break;
            case(5):
                SecondarySkill = "Light Armor";
                break;
            case(6):
                SecondarySkill = "Sneak";
                break;
            case(7):
                SecondarySkill = "Lockpicking";
                break;
            case(8):
                SecondarySkill = "Pickpocket";
                break;
            case(9):
                SecondarySkill = "Speech";
                break;
            case(10):
                SecondarySkill = "Alchemy";
                break;
        }

        switch(this.rngCharacterSex){
            case(1):
                characterSex = "Male";
                break;
            case(2):
                characterSex = "Female";
                break;
        }


        JOptionPane.showMessageDialog(null, "Race: "+ characterRace + "\n" + characterSex + "\nMain Skill: " + MainSkill + "\nSecondary Skill: " + SecondarySkill);
    }
}
