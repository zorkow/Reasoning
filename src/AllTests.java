import org.junit.ClassRule;
import org.junit.rules.ExternalResource;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ClauseTest.class, ResolutionTest.class })
public class AllTests {

	public static Clause h1 = new Clause();
	public static Clause h2 = new Clause();
	public static Clause h3 = new Clause();
	public static Clause h4 = new Clause();

	@ClassRule
	public static ExternalResource testSetups = new ExternalResource() {
		@Override
		protected void before() {
			h1.add(new Literal("A", true));
			h1.add(new Literal("A", false));
			h1.add(new Literal("B", true));

			h2.add(new Literal("A", true));
			h2.add(new Literal("A", false));
			h2.add(new Literal("B", false));

			h3.add(new Literal("A", true));
			h3.add(new Literal("A", false));
			h3.add(new Literal("B", true));
			h3.add(new Literal("B", false));

			h4.add(new Literal("A", true));
			h4.add(new Literal("A", false));
			h4.add(new Literal("B", true));
		}
	};
}