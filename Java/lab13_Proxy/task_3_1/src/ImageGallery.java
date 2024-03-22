public class ImageGallery {

    public static void main(String[] args) {

        DisplayObject[] images = {
            // якщо виникає помилка завантаження, замініть відносний шлях на абсотютний шлях!
            new ProxyDisplayObject("resources/image1.jpeg"),
            new ProxyDisplayObject("resources/image2.jpeg"),
            new ProxyDisplayObject("resources/image3.jpeg"),
            new ProxyDisplayObject("resources/image4.jpeg"),
            new ProxyDisplayObject("resources/image5.jpeg"),
            new ProxyDisplayObject("resources/image6.jpeg"),
            new ProxyDisplayObject("resources/image7.jpeg"),
            new ProxyDisplayObject("resources/image8.jpeg"),
            new ProxyDisplayObject("resources/image9.jpeg"),
            new ProxyDisplayObject("resources/image10.jpeg"),
        };

        for (DisplayObject image : images) {
            image.display();
        }
    }
}