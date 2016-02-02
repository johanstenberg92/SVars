package org.svars

import collection.mutable.{ Queue, ArrayBuffer }

import concurrent.{ Future, ExecutionContext, blocking }

import java.util.concurrent.atomic.AtomicInteger

trait HandlerPool[D, T] {

  def doPut(function: => Unit): Unit

  def doFuture(function: => Unit): Unit

  def quiesce(function: => D): Future[D]

}
