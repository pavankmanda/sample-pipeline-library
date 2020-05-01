package org.sample.ioc

import org.sample.IStepExecutor

interface IContext {
    IStepExecutor getStepExecutor()
}