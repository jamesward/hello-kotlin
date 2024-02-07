fun main() {

    val maybeKey: String? = "hello"
    val map = mapOf("hello" to "world")

    val maybeWorld1: String? = maybeKey?.let { key ->
        map[key]?.let { world ->
            "$key, $world"
        } // String?
    }

    assert(maybeWorld1 != null)

    val maybeWorld2: String? = maybeKey?.let {
        map["nope"] // String?
    }

    assert(maybeWorld2 == null)

    val maybeWorld3: String? = maybeKey?.let { key ->
        "$key, world"
    }

    assert(maybeWorld3 != null)

}
