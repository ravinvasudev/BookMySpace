///////////////////////////////////////////////////
// Include gulp dependencies first.
///////////////////////////////////////////////////
var gulp = require('gulp'),
    htmlmin = require('gulp-htmlmin'),
    uglify = require('gulp-uglify'),
    /*sass = require('gulp-ruby-sass'),*/
    sass = require('gulp-sass'),
    csso = require('gulp-csso'),
    concat = require('gulp-concat'),
    sourcemaps = require('gulp-sourcemaps'),
    autoprefix = require('gulp-autoprefixer'),
    imagemin = require('gulp-imagemin'),
    cache = require('gulp-cache'),
    changed = require('gulp-changed'),
    size = require('gulp-size'),
    gulpif = require('gulp-if'),
    plumber = require('gulp-plumber'),
    rename = require('gulp-rename'),
    watch = require('gulp-watch'),
    browserSync = require('browser-sync'),
    reload = browserSync.reload;

///////////////////////////////////////////////////
// BROWSER PREFIXES
///////////////////////////////////////////////////
var AUTOPREFIXER_BROWSERS = [
    'ie >= 10',
    'ie_mob >= 10',
    'ff >= 30',
    'chrome >= 34',
    'safari >= 7',
    'opera >= 23',
    'ios >= 7',
    'android >= 4.4',
    'bb >= 10'
];
///////////////////////////////////////////////////
// Scripts Task
///////////////////////////////////////////////////
gulp.task('scripts', function() {
    gulp.src('src/js/*.js')
        .pipe(plumber())
        .pipe(concat('main.js'))
        .pipe(rename({suffix:'.min'}))
        .pipe(uglify())
        .pipe(gulp.dest('js/'))
        .pipe(size({
            title: 'SCRIPTS'                                         /* OUTPUT MESSAGE TO CONSOLE */
        }))
        .pipe(reload({stream:true}));
});

///////////////////////////////////////////////////
// Styles Task
///////////////////////////////////////////////////
gulp.task('sass', function() {
    return gulp.src([
        'src/sass/*.scss',
        '!src/sass/_main.scss',
        '!src/sass/main.scss'
        ])                           /* SOURCE FILE. DO NOT ADD sass PARTIALS TO gulp.src */
        .pipe(plumber())
        .pipe(sourcemaps.init())
        .pipe(changed('.tmp/styles', {                              /* LOOK FOR CHANGED FILES TO PROCESS */
            extension: '.css',
            hasChanged: changed.compareLastModifiedTime
        }))
        .pipe(sass({                                                /* COMPILE THE .SCSS TO .CSS */
            outputStyle: 'compressed',
            precision: 10,
            onError: console.error.bind(console, 'Sass error:')
        }))
        .pipe(autoprefix({                                          /* PREFIX BROWSERS */
            browsers: AUTOPREFIXER_BROWSERS
        }))
        .pipe(sourcemaps.write())                                   /*  WRITE INLINE SOURCE MAP*/
        .pipe(gulp.dest('.tmp/styles'))
        .pipe(gulpif('*.css', csso()))                              /* CONCATENATE AND MINIFY .CSS */
        .pipe(gulp.dest('css/'))                                    /* SAVE .CSS TO css FOLDER */
        .pipe(size({
            title: 'STYLES'                                         /* OUTPUT MESSAGE TO CONSOLE */
        }))
        .pipe(reload({stream:true}));
});

///////////////////////////////////////////////////
//HTML Task
///////////////////////////////////////////////////
gulp.task('html', function() {
    gulp.src('src/*.html')
        .pipe(plumber())
        .pipe(htmlmin({collapseWhitespace: true}))
        .pipe(gulp.dest('./'))
        .pipe(size({
            title: 'HTML'                                       /* OUTPUT MESSAGE TO CONSOLE */
        }))
        .pipe(reload({stream:true}));
});

///////////////////////////////////////////////////
// IMAGE MINIFY TASKS
///////////////////////////////////////////////////
gulp.task('img-min', function() {
    gulp.src('src/img/*')
        .pipe(cache(imagemin({
            progressive: true,
            interlaced: true
        })))
        .pipe(gulp.dest('img/'))
        .pipe(size({
            title: 'IMAGES'                                     /* OUTPUT MESSAGE TO CONSOLE */
        }))
        .pipe(reload({stream:true}));
});

///////////////////////////////////////////////////
// BROWSER SYNC TASKS
///////////////////////////////////////////////////
gulp.task('browser-sync', function() {
    browserSync({
        server: {
            baseDir: './'
        }
    });
});
///////////////////////////////////////////////////
// WATCH TASKS
///////////////////////////////////////////////////
gulp.task('watch', function() {
    gulp.watch('src/js/**/*.js', ['scripts']);
    gulp.watch('src/sass/*.scss', ['sass']);
    gulp.watch('src/*.html', ['html']);
});

///////////////////////////////////////////////////
// Default Task
///////////////////////////////////////////////////
gulp.task('default', ['sass', 'scripts', 'html', 'img-min', 'browser-sync', 'watch']);
