package kata3;

public class Main {

   
    public static void main(String[] args) {
        
      Histogram<String> histogram = new Histogram();
      
      histogram.increment("gmail.com");
      histogram.increment("ulpgc.es");
      histogram.increment("dis.ulpgc.es");
      
      HistogramDisplay histo = new HistogramDisplay(histogram);
      histo.execute();
    }
    
}
