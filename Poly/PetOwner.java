
public class PetOwner {
    public static void main(String[] args) {
        Vet v = new Vet();
        Dog d = new Dog();
        Hippo h = new Hippo();
        Cat c = new Cat();

        v.giveShot(d);
        v.giveShot(h);
        v.giveShot(c);
    }
}