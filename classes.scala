// Author: Donato Kava, Dated and created: 8/11/2019
// Scala classes exploration file.

class Counter {
  private var value = 0
  def increment() {
      if (value == Int.MaxValue)
      {
        value = value  
      }
      else
      {
      value += 1
      }
  }
  def current() = value
}

class bankaccount {
  private var account = 0
  def deposit () {
  }
  def withdraw () {
  }
  def balance = account
}
