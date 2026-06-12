import java.util.Arrays;

class DataSet {
    private double data[];
    private int datasize;
    private double sum;

    public DataSet() {
        data = new double[100];
        datasize = 0;
        sum = 0;
    }

    public void add(double value) {
        if (datasize == data.length) {
            System.out.println("Dataset is full");
            return;
        }
        data[datasize] = value;
        datasize++;
        sum += value;
    }

    public double getAverage() {
        return (datasize == 0 ? 0 : sum / datasize);
    }

    public double getStandardDeviation() {
        if (datasize == 0) {
            return 0;
        }
        double mean = getAverage();
        double sumOfSquares = 0;
        for (int i = 0; i < datasize; i++) {
            sumOfSquares += Math.pow(data[i] - mean, 2);
        }
        return Math.sqrt(sumOfSquares / datasize);
    }

    public static double calculateAverage(DataSet[] datasets) {

        double total = 0;
        for (DataSet ds : datasets) {
            total += ds.getAverage();
        }
        return total / datasets.length;
    }

    @Override
    public String toString() {
        return "DataSet{data=" + Arrays.toString(data) + ", datasize=" + datasize + ", sum=" + sum + "}";
    }
}

public class instance {

    public static void main(String[] args) {

        // Test Part (a): Standard Deviation

        DataSet dataset = new DataSet();

        dataset.add(10.0);

        dataset.add(3.7);

        dataset.add(4.5);

        System.out.println("Standard Deviation: " + dataset.getStandardDeviation());

        // Test Part (b): Average of Averages

        DataSet d1 = new DataSet();

        d1.add(20.0);

        d1.add(30.0);

        d1.add(40.0);

        DataSet d2 = new DataSet();

        d2.add(10.0);

        d2.add(20.0);

        d2.add(30.0);

        DataSet d3 = new DataSet();

        d3.add(50.0);

        d3.add(60.0);

        d3.add(70.0);

        DataSet[] datasets = { d1, d2, d3 };

        System.out.println("Average of Averages: " + DataSet.calculateAverage(datasets));

    }

}
