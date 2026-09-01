package io.jenkins.plugins.aiassistant;

import hudson.Extension;
import hudson.model.Action;
import hudson.model.Run;
import jenkins.model.TransientActionFactory;

import java.util.Collection;
import java.util.Collections;

@Extension
public class AiAssistantBuildActionFactory
        extends TransientActionFactory<Run<?, ?>> {

    @Override
    public Class<Run<?, ?>> type() {
        return (Class) Run.class;
    }

    @Override
    public Collection<? extends Action> createFor(Run<?, ?> run) {
        return Collections.singletonList(
                new AiAssistantBuildAction(run)
        );
    }
}
