package guava;

public class ProcessDataImpl implements IProcessData {
    @Override
    public String deal(String data) {
          try {
             Thread. sleep(1000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
          return "Finished:" + data;
    }

    @Override
    public String dealTwo(String data) {
        return "dealTwo";
    }
}
