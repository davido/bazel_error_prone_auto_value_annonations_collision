### Reproduce for https://github.com/bazelbuild/bazel/issues/10948

Without auto-value annotation processor all is fine:


```
  $ bazel build flogger_works 
INFO: Analyzed target //:flogger_works (0 packages loaded, 1 target configured).
INFO: Found 1 target...
Target //:flogger_works up-to-date:
  bazel-bin/libflogger_works.jar
INFO: Elapsed time: 0.076s, Critical Path: 0.00s
INFO: 0 processes.
INFO: Build completed successfully, 1 total action
```

With auto-value annotation processor there is collision with error prone:

```
  $ bazel build flogger_broken
INFO: Analyzed target //:flogger_broken (0 packages loaded, 0 targets configured).
INFO: Found 1 target...
ERROR: /home/davido/projects/bazel_error_prone_auto_value_annonations_collision/BUILD.bazel:9:1: Building libflogger_broken.jar (1 source file) and running annotation processors (AutoAnnotationProcessor) failed (Exit 1)
error: cannot access CheckReturnValue
  class file for com.google.errorprone.annotations.CheckReturnValue not found
Target //:flogger_broken failed to build
Use --verbose_failures to see the command lines of failed build steps.
INFO: Elapsed time: 0.269s, Critical Path: 0.16s
INFO: 0 processes.
FAILED: Build did NOT complete successfully
```
