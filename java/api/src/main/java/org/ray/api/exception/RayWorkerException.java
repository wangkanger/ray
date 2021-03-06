package org.ray.api.exception;

/**
 * Indicates that the worker died unexpectedly while executing a task.
 */
public class RayWorkerException extends RayException {

  public static final RayWorkerException INSTANCE = new RayWorkerException();

  private RayWorkerException() {
    super("The worker died unexpectedly while executing this task.");
  }
}
