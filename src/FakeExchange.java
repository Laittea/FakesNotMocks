public class FakeExchange implements Exchange {
  @Override
  public float rate(String origin, String target) {
    if (origin.equals("USD") && target.equals("Euro")) {
      return 0.95582821f;
    }
    return 1.0f;
  }
}
