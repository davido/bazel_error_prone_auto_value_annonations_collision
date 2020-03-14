load("@bazel_tools//tools/build_defs/repo:java.bzl", "java_import_external")

java_import_external(
    name = "com_google_auto_value",
    extra_build_file_content = "\n".join([
        "java_plugin(",
        "    name = \"AutoAnnotationProcessor\",",
        "    output_licenses = [\"unencumbered\"],",
        "    processor_class = \"com.google.auto.value.processor.AutoAnnotationProcessor\",",
        "    deps = [\":processor\"],",
        ")",
        "",
        "java_library(",
        "    name = \"com_google_auto_value\",",
        "    exported_plugins = [",
        "        \":AutoAnnotationProcessor\",",
        "    ],",
        "    exports = [\"@com_google_auto_value_annotations\"],",
        ")",
    ]),
    generated_rule_name = "processor",
    jar_sha256 = "b66df6984d5c29f15a6253514c817fb046e8e242efffc79e42c33f2dde0edf41",
    jar_urls = [
        "https://mirror.bazel.build/repo1.maven.org/maven2/com/google/auto/value/auto-value/1.7/auto-value-1.7.jar",
        "https://repo1.maven.org/maven2/com/google/auto/value/auto-value/1.7/auto-value-1.7.jar",
    ],
    licenses = ["notice"],  # Apache 2.0
    exports = ["@com_google_auto_value_annotations"],
)

java_import_external(
    name = "com_google_auto_value_with_errorprone_annotations",
    extra_build_file_content = "\n".join([
        "java_plugin(",
        "    name = \"AutoAnnotationProcessor\",",
        "    output_licenses = [\"unencumbered\"],",
        "    processor_class = \"com.google.auto.value.processor.AutoAnnotationProcessor\",",
        "    deps = [\":processor\"],",
        ")",
        "",
        "java_library(",
        "    name = \"com_google_auto_value_with_errorprone_annotations\",",
        "    exported_plugins = [",
        "        \":AutoAnnotationProcessor\",",
        "    ],",
        "    exports = [\"@com_google_auto_value_annotations\", \"@error_prone_annotations\"],",
        ")",
    ]),
    generated_rule_name = "processor",
    jar_sha256 = "b66df6984d5c29f15a6253514c817fb046e8e242efffc79e42c33f2dde0edf41",
    jar_urls = [
        "https://mirror.bazel.build/repo1.maven.org/maven2/com/google/auto/value/auto-value/1.7/auto-value-1.7.jar",
        "https://repo1.maven.org/maven2/com/google/auto/value/auto-value/1.7/auto-value-1.7.jar",
    ],
    licenses = ["notice"],  # Apache 2.0
    exports = ["@com_google_auto_value_annotations"],
)

java_import_external(
    name = "com_google_auto_value_annotations",
    default_visibility = [
        "@com_google_auto_value//:__pkg__",
        "@com_google_auto_value_with_errorprone_annotations//:__pkg__",
    ],
    jar_sha256 = "b134bab5082e9f49f2b45802573c78e0726e059b645323645da03e328e501f86",
    jar_urls = [
        "https://mirror.bazel.build/repo1.maven.org/maven2/com/google/auto/value/auto-value-annotations/1.7/auto-value-annotations-1.7.jar",
        "https://repo1.maven.org/maven2/com/google/auto/value/auto-value-annotations/1.7/auto-value-annotations-1.7.jar",
    ],
    licenses = ["notice"],  # Apache 2.0
)

java_import_external(
    name = "error_prone_annotations",
    jar_sha256 = "baf7d6ea97ce606c53e11b6854ba5f2ce7ef5c24dddf0afa18d1260bd25b002c",
    jar_urls = [
        "https://repo1.maven.org/maven2/com/google/errorprone/error_prone_annotations/2.3.4/error_prone_annotations-2.3.4.jar",
    ],
    licenses = ["notice"],  # BSD 3-clause
)

java_import_external(
    name = "flogger",
    jar_sha256 = "3cc25500489040f2981657eefa8dd9905e684b567e2fa907c33bbe8425e80b97",
    jar_urls = [
        "https://repo1.maven.org/maven2/com/google/flogger/flogger/0.4/flogger-0.4.jar",
    ],
    licenses = ["notice"],  # Apache 2.0
)
