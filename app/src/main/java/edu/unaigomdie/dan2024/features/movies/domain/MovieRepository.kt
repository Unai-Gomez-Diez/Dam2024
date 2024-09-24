package edu.unaigomdie.dan2024.features.movies.domain

interface MovieRepository {

    fun getMovies(): List<Movie>

    fun getMovie(id: String): Movie?

}