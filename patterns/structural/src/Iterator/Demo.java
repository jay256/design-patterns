package Iterator;

public class Demo {

    public static void main(String[] args) {
        Node<Integer> root = new Node<>(1, new Node<>(2), new Node<>(3));

        InOrderIterator<Integer> it = new InOrderIterator<Integer>(root);

        while(it.hasNext()){
            System.out.print("" + it.next() + ",");
        }
        System.out.println();

        BinaryTree<Integer> tree= new BinaryTree<Integer>(root);
        for(int n:tree){
            System.out.print(""+n+",");
        }
        System.out.println();

        Creature creature = new Creature();
        creature.setAgility(12);
        creature.setIntelligence(13);
        creature.setStrength(17);
        System.out.println(
                "Creature has a max stat of " + creature.max()
                + ", total stats of " + creature.sum()
                +", average stat of " + creature.average()
        );
    }

}
