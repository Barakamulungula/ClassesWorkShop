package com.company;

public class Cat extends Pet{

    private boolean likesCatnip;

    public Cat(String ownerName, String petName, String homeAddress, int age, char gender, boolean likesCatnip, boolean usesLitterbox, String furType) {

        super(ownerName, petName, homeAddress, age, gender);
        this.likesCatnip = likesCatnip;
        this.usesLitterbox = usesLitterbox;
        this.furType = furType;
    }

    private boolean usesLitterbox;
    private String furType;


    public boolean isLikesCatnip() {
        return likesCatnip;
    }

    public void setLikesCatnip(boolean likesCatnip) {
        this.likesCatnip = likesCatnip;
    }

    public boolean isUsesLitterbox() {
        return usesLitterbox;
    }

    public void setUsesLitterbox(boolean usesLitterbox) {
        this.usesLitterbox = usesLitterbox;
    }

    public String getFurType() {
        return furType;
    }

    public void setFurType(String furType) {
        this.furType = furType;
    }

    @Override
    protected String makeSound() {
        return "meow";
    }

    protected String catYear(){
        int convertedAge;
        switch(getAge()){
            case 0:
                convertedAge = 0;
            break;
            case 1:
                convertedAge = 19;
            break;
            default:
                convertedAge = ((super.getAge()-2)*4+24);
            break;
        }
        return super.getPetName()+" is " + super.getAge() + " in human years and " + convertedAge +" in cat years";
    }
}
