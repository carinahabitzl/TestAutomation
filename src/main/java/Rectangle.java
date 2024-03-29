public class Rectangle {

    double width;
    double height;
    double a;
    double u;


    public Rectangle(double width, double height) {
        this.width = checkInputParameter(width, "width");
        this.height = checkInputParameter(height, "height");
    }

    /**
     * Berechnet die Fläche des Rechtecks
     *
     * @return  den Flöcheninhalt
     */
    public double calculateArea() {
        // please implement method
        a = width*height;
        return a;
    }

    /**
     * Berechnet den Umfang des Rechtecks
     * @return den Umfang
     */
    public double calculateScope() {
        // please implement method
        u = 2*(width+height);
        return u;
    }

    /**
     * Check if inputParameter is greater than 0
     * @param input         height or width
     * @param parameterName the name of the parameter (e.g. width)
     * @return              the input value if greater than 0
     */
    public double checkInputParameter(double input, String parameterName) {
        if (input <= 0) {
            throw new IllegalArgumentException("Parameter " + parameterName + " muss größer 0 sein!");
        }

        return input;
    }
}
