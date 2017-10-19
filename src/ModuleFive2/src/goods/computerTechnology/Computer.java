package goods.computerTechnology;

import goods.Goods;
import goods.computerTechnology.DataSheet.Processor;
import goods.computerTechnology.DataSheet.RAM;
import goods.computerTechnology.DataSheet.VideoCard;

public class Computer extends Goods {
    private RAM ram;
    private Processor processor;
    private VideoCard videoCard;

    public Computer(int id, String name, int count, String description, double price) {
        super(id, name, count, description, price);
    }

    public Computer(int id, String name, int count, String description,
                    double price, RAM ram, Processor processor, VideoCard videoCard) {
        super(id, name, count, description, price);
        this.ram = ram;
        this.processor = processor;
        this.videoCard = videoCard;
    }

    @Override
    public void show() {
        super.show();
        ram.show();
        processor.show();
        videoCard.show();
    }

    // Getters and setters
    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }
}
