package org.sample

interface IStepExecutor {
    int sh(String command)
    void error(String message)
}