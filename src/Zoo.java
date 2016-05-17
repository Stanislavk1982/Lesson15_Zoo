public class Zoo {
    private String name;
    private int weight;
    private int growth;
    private String voice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;

    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void showAnimal() {
        System.out.println("In Zoo animal: " + name+ ". Its weight is: "+ weight+" and growth is: "+ growth);
        System.out.println("And vois is: "+voice);
    }
}
