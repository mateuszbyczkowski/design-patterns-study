package fabryka.abstractFactory;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        Computer computer;
        computer = new Computer("PC0001", new AMDFactory());
        computer = new Computer("PC0002", new IntelFactory());
    }
}

//RODZINA PRODUKTÓW: PROCESORY
interface Processor {
    void process();
}

class AMDProcessor implements Processor {
    @Override
    public void process() {
        System.out.println("Przygotowuję procesor AMD...");
    }
}

class IntelProcessor implements Processor {
    @Override
    public void process() {
        System.out.println("Przygotowuję procesor Intel...");
    }
}

//RODZINA PRODUKTÓW: WIATRACZKI
interface Cooler {
    void process();
}

class AMDCooler implements Cooler {
    @Override
    public void process() {
        System.out.println("Przygotowuję wiatraczek AMD...");
    }
}

class IntelCooler implements Cooler {
    @Override
    public void process() {
        System.out.println("Przygotowuję wiatraczek Intel...");
    }
}

//RODZINA FABRYK: PRODUCENCI
interface ProcessorFactory {
    public Processor createProcessor();
    public Cooler createCooler();
}

class AMDFactory implements ProcessorFactory {

    @Override
    public Processor createProcessor() {
        return new AMDProcessor();
    }

    @Override
    public Cooler createCooler() {
        return new AMDCooler();
    }
}

class IntelFactory implements ProcessorFactory {

    @Override
    public Processor createProcessor() {
        return new IntelProcessor();
    }

    @Override
    public Cooler createCooler() {
        return new IntelCooler();
    }
}

class Computer {
    private String serialNumber;
    private Processor processor;
    private Cooler cooler;

    public Computer(String serialNumber, ProcessorFactory factory) {
        this.serialNumber = serialNumber;
        processor = factory.createProcessor();
        cooler = factory.createCooler();
        process();
    }

    private void process() {
        System.out.println("Rozpoczynam składanie komputera o numerze seryjnym: " + serialNumber);
        processor.process();
        cooler.process();
        System.out.println("Zakończyłem składanie komputera o numerze seryjnym: " + serialNumber);
    }
}