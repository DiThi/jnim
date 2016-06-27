jnim - JNI library for Nim language
======================================

[![Build Status](https://travis-ci.org/vegansk/jnim.svg?branch=master)](https://travis-ci.org/vegansk/jnim)

Native language integration with Java VM has never been easier!
```nim
import jnim

# Import a couple of classes
jclass java.io.PrintStream of JVMObject:
  proc println(s: string)
jclass java.lang.System of JVMObject:
  proc `out`: PrintStream {.prop, final, `static`.}

# Initialize JVM
initJNI()
# Call!
System.`out`.println("This string is printed with System.out.println!")
```

Overview
--------

This library is the result of rethinking of the original jnim library created by @yglukhov.
The list of the main features:

* API splitted in two parts: low and high level.
* It supports Java inheritance and generics.

Original library is still available as [src/jnim1.nim](src/jnim1.nim).

The documentation is coming soon. Now you can look the examples in the [tests](tests) directory.
For example, [tests/test_javaapi_core.nim](tests/test_javaapi_core.nim) and [tests/test_javaapi_containers.nim](tests/test_javaapi_containers.nim)
shows how to use high level API.

If you want to run the tests, use ``nim test`` command.

## Installation
```sh
nimble install jnim
```
