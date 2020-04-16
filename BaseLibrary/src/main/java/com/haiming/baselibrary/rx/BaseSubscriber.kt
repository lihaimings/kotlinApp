package com.haiming.baselibrary.rx

import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import org.reactivestreams.Subscriber
import org.reactivestreams.Subscription

open class BaseSubscriber<T> : Observer<T> {
    override fun onComplete() {

    }

    override fun onNext(t: T) {

    }

    override fun onError(t: Throwable?) {

    }

    override fun onSubscribe(d: Disposable?) {

    }
}