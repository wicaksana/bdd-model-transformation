
package mde.project4.code.stories;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import static org.jbehave.core.reporters.Format.CONSOLE;
import static org.jbehave.core.reporters.Format.TXT;

import mde.project4.code.steps.AdditionOperationSteps;

public class AdditionOperationStories extends JUnitStory {
	@Override
	public Configuration configuration() {
		return super.configuration()
				.useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats().withFormats(CONSOLE, TXT));
	}

	@Override
	public InjectableStepsFactory stepsFactory() {
		return new InstanceStepsFactory(configuration(), new AdditionOperationSteps());
	}
}