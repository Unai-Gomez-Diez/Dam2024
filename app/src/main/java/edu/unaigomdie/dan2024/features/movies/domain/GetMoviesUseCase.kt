package edu.unaigomdie.dan2024.features.movies.domain

class GetMoviesUseCase(private val movieRepository: MovieRepository) {

    operator fun invoke(): List<Movie> {
        return movieRepository.getMovies()
    }

}