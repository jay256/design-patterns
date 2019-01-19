package composite;

public class Demo {

    public static void main(String[] args) {
        GraphicObject graphicObject = new GraphicObject();
        graphicObject.setName("My drawing");
        graphicObject.children.add(new Square("Red"));
        graphicObject.children.add(new Circle("Yellow"));

        GraphicObject group = new GraphicObject();
        group.children.add(new Circle("Blue"));
        group.children.add(new Square("Blue"));

        graphicObject.children.add(group);

        System.out.println(graphicObject);


        Neuron neuron = new Neuron();
        Neuron neuron1 = new Neuron();
        NeuronLayer neuronLayer = new NeuronLayer();
        NeuronLayer neuronLayer2 = new NeuronLayer();

        neuron.connectTo(neuron1);
        neuron.connectTo(neuronLayer);
        neuronLayer.connectTo(neuron);
        neuronLayer.connectTo(neuronLayer2);
    }
}
