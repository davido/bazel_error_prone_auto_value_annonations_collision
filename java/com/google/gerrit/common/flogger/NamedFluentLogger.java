package com.google.gerrit.common.flogger;

import com.google.common.flogger.AbstractLogger;
import com.google.common.flogger.LoggingApi;
import com.google.common.flogger.backend.LoggerBackend;
import java.util.logging.Level;

final class NamedFluentLogger extends AbstractLogger<NamedFluentLogger.Api> {
  interface Api extends LoggingApi<Api> {}

  static final class NoOp extends LoggingApi.NoOp<Api> implements Api {}

  NamedFluentLogger(LoggerBackend backend) {
    super(backend);
  }

  @Override
  public Api at(Level level) {
    return new NoOp();
  }
}
