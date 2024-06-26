package de.uniks.stp24;

import dagger.Component;
import de.uniks.stp24.dagger.MainComponent;
import de.uniks.stp24.dagger.MainModule;

import javax.inject.Singleton;

@Component(modules = {MainModule.class, TestModule.class})
@Singleton
public interface TestComponent extends MainComponent {

    @Component.Builder
    interface Builder extends MainComponent.Builder {
        @Override
        TestComponent build();
    }
}
