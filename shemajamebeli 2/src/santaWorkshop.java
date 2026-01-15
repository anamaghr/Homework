public class santaWorkshop {
    public static void main(String[] args) {
        elf elf1 = new elf("elf1", "wrapper",10,5,"gift wrapper");
        elf elf2 = new elf("elf2", "elfie", 12, 8,"toy maker");

        elf1.makeToy();
        elf1.wrapGifts();

        elf2.makeToy();
        elf2.wrapGifts();

        reindeer r1 = new reindeer("r1", 5,60, "brown");
        reindeer r2 = new reindeer("r2", 15,90, "red");

        r1.fly();
        System.out.println("fitness leven: " + r1.checkFitnessLevel());

        r2.fly();
        System.out.println("fitness leven: " + r2.checkFitnessLevel());

        child child1 = new child("c1", 8);
        child1.addWish("doll");

        child child2 = new child("c2", 2);
        child2.addWish("car");

        child child3 = new child("c3", 7);
        child3.addWish("book");

        santa santa = new santa("santa", "claus", 70);

        santa.checkNaughtyOrNiceList();
        santa.deliverGifts();

        snowman snowman = new snowman(4.5,"red");

        snowman.decorate("scarf");
        snowman.decorate("carrot");

        System.out.println("snowman before melting: "  + snowman);
        snowman.melt();
        System.out.println("snowman after melting" + snowman);

    }
    }