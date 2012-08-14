package com.qubit
import org.scalatest.FunSuite
import org.scalatest.FeatureSpec

 class AppTest extends FunSuite {

  test("my first test") {
    expect("hello") {
      "hello"
    }
  }
}
