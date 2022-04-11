package designpatterns;

public class Singleton {
  private Singleton() {
  }

  static class SingletonHelper {
    private static Singleton INSTANCE = new Singleton();
  }

  public Singleton getOnlyInstance() {
    return SingletonHelper.INSTANCE;
  }
}
