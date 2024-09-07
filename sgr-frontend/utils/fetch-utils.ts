const backendApi = process.env.SGR_BACKEND_API;

export default async function fetchFromBackendApi(url: string) {
//     TODO: catch errors
    return fetch(`${backendApi}${url}`, { cache: 'no-store' })
        .then(resp => resp.json());
}