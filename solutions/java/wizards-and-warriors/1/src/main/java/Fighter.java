class Fighter {

    String fighterType;

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
    
    @Override
    public String toString(){
        return "Fighter is a " + fighterType;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter{

    public Warrior(){
        super.fighterType = "Warrior";
    }
    
    @Override
    boolean isVulnerable() {
        return false;
    }
    
    @Override
    int getDamagePoints(Fighter fighter) {
        if(fighter.isVulnerable()){
            return 10;
        }else{
            return 6;
        }
    }
    
    @Override
    public String toString(){
        return "Fighter is a " + fighterType;
    }
    
}

// TODO: define the Wizard class
class Wizard extends Fighter{

    public Wizard(){
        super.fighterType = "Wizard";
    }

    private boolean isSpellPrepared = false;

    @Override
    boolean isVulnerable() {
        if(isSpellPrepared){
            return false;
        }else{
            return true;
        }
    }
    
    @Override
    int getDamagePoints(Fighter fighter) {
        if(isSpellPrepared){
            return 12;
        }else{
            return 3;
        }
    }

    void prepareSpell(){
        isSpellPrepared = true;
    }
    
    @Override
    public String toString(){
        return "Fighter is a " + fighterType;
    }
    
}