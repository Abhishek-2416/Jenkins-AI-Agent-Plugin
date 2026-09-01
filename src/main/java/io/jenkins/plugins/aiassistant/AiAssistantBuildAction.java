package io.jenkins.plugins.aiassistant;

import hudson.model.Action;
import hudson.model.Run;

public class AiAssistantBuildAction implements Action {

    private final Run<?, ?> build;

    public AiAssistantBuildAction(Run<?, ?> build) {
        this.build = build;
    }

    public Run<?, ?> getBuild() {
        return build;
    }

    @Override
    public String getIconFileName() {
        return "symbol-robot";
    }

    @Override
    public String getDisplayName() {
        return "AI Assistant";
    }

    @Override
    public String getUrlName() {
        return "ai-assistant";
    }
}
