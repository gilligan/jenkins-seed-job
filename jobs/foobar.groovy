freeStyleJob('foobar') {

    description('Foo of the Bar in Baz')

    steps {
        shell("echo 'HELLO WORLD'")
    }
}
