### QA Guru / HW №15
#### Owner library
___
To run tests we can pass params via -D command in Terminal

**Examples:**

* Locally
```b
gradle clean test -Denv=local
```
* Remote
```b
gradle clean test -Denv=remote
```

* API
```b
gradle clean api_test -Dcookie=6aca33e1-f9db-4f9a-8139-40406680d2ce
```
