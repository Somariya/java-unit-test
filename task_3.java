@RunWith(Parameterized.class) 
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	this.age = age;
    this.result = result;
  }

  @Parameterized.Parameters
  public static Object[][] getTextData() {
	return new Object[][] {
		{20, true },
        {17, false},
        {21, true},
        {18, true},
        
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
	
    boolean isAdult = program.checkIsAdult(age);

    assertEquals("Возраст не соответствует возрасту совершеннолетия",result, isAdult);
	}
}
