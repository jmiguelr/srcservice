import srcservice.SourcePogo

// Place your Spring DSL code here
beans = {

    sourcePogo(SourcePogo) {
        serviceTwoService = ref('serviceTwoService')
    }
}
