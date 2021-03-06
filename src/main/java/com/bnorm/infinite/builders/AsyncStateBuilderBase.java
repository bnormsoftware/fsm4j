package com.bnorm.infinite.builders;

import java.util.function.Supplier;

import com.bnorm.infinite.Action;
import com.bnorm.infinite.StateMachineStructure;
import com.bnorm.infinite.Transition;
import com.bnorm.infinite.TransitionGuard;
import com.bnorm.infinite.async.AsyncActionFactory;

/**
 * The base implementation of an asynchronous state builder.
 *
 * @param <S> the class type of the states.
 * @param <E> the class type of the events.
 * @param <C> the class type of the context.
 * @author Brian Norman
 * @since 1.1.0
 */
public class AsyncStateBuilderBase<S, E, C> extends StateBuilderBase<S, E, C> implements AsyncStateBuilder<S, E, C> {

    /** The asynchronous action factory. */
    protected final AsyncActionFactory<S, E, C> asyncActionFactory;

    /**
     * Constructs a new state builder from the specified state machine structure, asynchronous action factory, and state
     * being built.
     *
     * @param structure the state machine structure.
     * @param state the state being built.
     * @param asyncActionFactory the factory used to create asynchronous actions.
     */
    public AsyncStateBuilderBase(StateMachineStructure<S, E, C> structure, S state,
                                 AsyncActionFactory<S, E, C> asyncActionFactory) {
        super(structure, state);
        this.asyncActionFactory = asyncActionFactory;
    }

    @Override
    public AsyncStateBuilderBase<S, E, C> childOf(S parent) {
        super.childOf(parent);
        return this;
    }

    @Override
    public AsyncStateBuilderBase<S, E, C> onEntry(Action<? super S, ? super E, ? super C> action) {
        super.onEntry(action);
        return this;
    }

    @Override
    public AsyncStateBuilderBase<S, E, C> onAsyncEntry(Action<? super S, ? super E, ? super C> action) {
        return onEntry(asyncActionFactory.create(action));
    }

    @Override
    public AsyncStateBuilderBase<S, E, C> onExit(Action<? super S, ? super E, ? super C> action) {
        super.onExit(action);
        return this;
    }

    @Override
    public AsyncStateBuilderBase<S, E, C> onAsyncExit(Action<? super S, ? super E, ? super C> action) {
        onExit(asyncActionFactory.create(action));
        return this;
    }

    @Override
    public AsyncStateBuilderBase<S, E, C> handle(E event, Transition<S, E, C> transition) {
        super.handle(event, transition);
        return this;
    }

    @Override
    public AsyncStateBuilderBase<S, E, C> handle(E event) {
        super.handle(event);
        return this;
    }

    @Override
    public AsyncStateBuilderBase<S, E, C> handle(E event, S destination) {
        super.handle(event, destination);
        return this;
    }

    @Override
    public AsyncStateBuilderBase<S, E, C> handle(E event, Supplier<S> destination) {
        super.handle(event, destination);
        return this;
    }

    @Override
    public AsyncStateBuilderBase<S, E, C> handle(E event, TransitionGuard<C> guard) {
        super.handle(event, guard);
        return this;
    }

    @Override
    public AsyncStateBuilderBase<S, E, C> handle(E event, Action<? super S, ? super E, ? super C> action) {
        super.handle(event, action);
        return this;
    }

    @Override
    public AsyncStateBuilder<S, E, C> handleAsync(E event, Action<? super S, ? super E, ? super C> action) {
        super.handle(event, asyncActionFactory.create(action));
        return this;
    }

    @Override
    public AsyncStateBuilderBase<S, E, C> handle(E event, S destination, TransitionGuard<C> guard) {
        super.handle(event, destination, guard);
        return this;
    }

    @Override
    public AsyncStateBuilderBase<S, E, C> handle(E event, Supplier<S> destination, TransitionGuard<C> guard) {
        super.handle(event, destination, guard);
        return this;
    }

    @Override
    public AsyncStateBuilderBase<S, E, C> handle(E event, S destination,
                                                 Action<? super S, ? super E, ? super C> action) {
        super.handle(event, destination, action);
        return this;
    }

    @Override
    public AsyncStateBuilder<S, E, C> handleAsync(E event, S destination,
                                                  Action<? super S, ? super E, ? super C> action) {
        super.handle(event, destination, asyncActionFactory.create(action));
        return this;
    }

    @Override
    public AsyncStateBuilderBase<S, E, C> handle(E event, Supplier<S> destination,
                                                 Action<? super S, ? super E, ? super C> action) {
        super.handle(event, destination, action);
        return this;
    }

    @Override
    public AsyncStateBuilder<S, E, C> handleAsync(E event, Supplier<S> destination,
                                                  Action<? super S, ? super E, ? super C> action) {
        super.handle(event, destination, asyncActionFactory.create(action));
        return this;
    }

    @Override
    public AsyncStateBuilderBase<S, E, C> handle(E event, S destination, TransitionGuard<C> guard,
                                                 Action<? super S, ? super E, ? super C> action) {
        super.handle(event, destination, guard, action);
        return this;
    }

    @Override
    public AsyncStateBuilder<S, E, C> handleAsync(E event, S destination, TransitionGuard<C> guard,
                                                  Action<? super S, ? super E, ? super C> action) {
        super.handle(event, destination, guard, asyncActionFactory.create(action));
        return this;
    }

    @Override
    public AsyncStateBuilderBase<S, E, C> handle(E event, Supplier<S> destination, TransitionGuard<C> guard,
                                                 Action<? super S, ? super E, ? super C> action) {
        super.handle(event, destination, guard, action);
        return this;
    }

    @Override
    public AsyncStateBuilder<S, E, C> handleAsync(E event, Supplier<S> destination, TransitionGuard<C> guard,
                                                  Action<? super S, ? super E, ? super C> action) {
        super.handle(event, destination, guard, asyncActionFactory.create(action));
        return this;
    }
}
