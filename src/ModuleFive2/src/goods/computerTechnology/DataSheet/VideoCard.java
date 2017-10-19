package goods.computerTechnology.DataSheet;

public class VideoCard {
   private Processor videoCardProperty;
   private RAM videoMemory;

    public VideoCard(){
        this(null,null);
    }

   public VideoCard(Processor videoCardProperty, RAM videoMemory) {
        this.videoCardProperty = videoCardProperty;
        this.videoMemory = videoMemory;
   }

   public void show(){
       System.out.println("Количество ядер видеокарты: " + videoCardProperty.getNumberOfCores());
       System.out.println("Тактовая частота ядра видеокарты: " + videoCardProperty.getCoreFrequency());
       System.out.println("Обьем видеопамяти: " + videoMemory.getAmountOfRAM());
       System.out.println("Тип видео памяти: " + videoMemory.getTypeOfRAM());
   }

   // Getters and setters
   public Processor getVideoCardProperty() {
        return videoCardProperty;
    }

   public void setVideoCardProperty(Processor videoCardProperty) {
        this.videoCardProperty = videoCardProperty;
   }

   public RAM getVideoMemory() {
        return videoMemory;
   }

   public void setVideoMemory(RAM videoMemory) {
        this.videoMemory = videoMemory;
   }
}
